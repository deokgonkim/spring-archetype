mvn \
-Dsonar.host.url=https://www.ossfsc.net/sonarqube \
-Dsonar.exclusions=src/main/webapp/vendor/**/* \
-Dsonar.login=`read -p Username: u; echo $u` \
-Dsonar.password=`read -s -p Password: p; echo $p` \
sonar:sonar

