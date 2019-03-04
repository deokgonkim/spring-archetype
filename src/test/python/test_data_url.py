# -*- coding: utf-8 -*-

import urllib2
import unittest

BASE_URL='http://localhost:8080/spring-archetype/'

TEST_USERNAME='user'
TEST_PASSWORD='password'

DB_DATA_URL='http://localhost:8080/spring-archetype/data/db'


class TestDataUrl(unittest.TestCase):

    # create a password manager
    password_mgr = urllib2.HTTPPasswordMgrWithDefaultRealm()

    # Add the username and password.
    # If we knew the realm, we could use it instead of None.
    password_mgr.add_password(None, BASE_URL, TEST_USERNAME, TEST_PASSWORD)

    handler = urllib2.HTTPBasicAuthHandler(password_mgr)

    # create "opener" (OpenerDirector instance)
    opener = urllib2.build_opener(handler)

    # use the opener to fetch a URL
    #opener.open(a_url)

    # Install the opener.
    # Now all calls to urllib2.urlopen use our opener.
    urllib2.install_opener(opener)

    def test(self):

        req = urllib2.Request(DB_DATA_URL, None, {'X-Requested-With': 'XMLHttpRequest'}) 
        try:
            response = urllib2.urlopen(req)
            response_str = response.read()
            self.assertTrue(len(response_str) > 0)
        except Exception, e:
            self.fail(e)

        print(response_str)


if __name__ == '__main__':
    unittest.main()
