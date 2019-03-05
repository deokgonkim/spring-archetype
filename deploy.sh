mvn \
-Dmaven.test.skip=true \
-Dtomcat.server.id=www.ossfsc.net \
-Dtomcat.manager.url=https://www.ossfsc.net/manager/text \
-e \
tomcat7:deploy
