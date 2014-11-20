Get started with PG2Challenge3
-----------------------------------
Welcome to Java Web Starter application!

This sample application demonstrates how to write a Java Web application (powered by WebSphere Liberty) and deploy it on Bluemix.

1. [Install the cf command-line tool](https://www.ng.bluemix.net/docs/#starters/BuildingWeb.html#install_cf).
2. [Download the starter application package](https://ace.ng.bluemix.net:443/rest/../rest/apps/6fdd2bdd-50fc-42ad-8d92-aa54972c263f/starter-download).
3. Extract the package and `cd` to it.
4. Connect to Bluemix:

		cf api https://api.ng.bluemix.net

5. Log into Bluemix:

		cf login -u jp378@mail.umkc.edu
		cf target -o jp378@mail.umkc.edu -s dev
				
6. Compile the Java code and generate the war package using ant.
7. Deploy your app:

		cf push PG2Challenge3 -p webStarterApp.war

8. Access your app: [http://PG2Challenge3.mybluemix.net](http://PG2Challenge3.mybluemix.net)
