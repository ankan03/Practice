# Practice
Beginner level problem practice

### In Eclipse For creating new  Dynamic Web Project

1. File -> New -> Dynamic Web Project -> enter name of the project -> next -> select 'src' -> next -> select 'Generate web.xml' -> finish

2. RightClick on 'WebContent' -> New -> JSP file -> provide a name(Demo.jsp) -> Finish -> Write something in the body for testing

3. Go to Server(From bottom menu) -> Define a new server -> Select Apache ->Select Tomcat v8.5 Server -> Provide tomcat installation directory -> Finish -> Select Project -> Add-> Finish

4. Go to web.xml -> inside <welcome-file-list> add <welcome-file>Demo.jsp</welcome-file> -> Save

5. RightClick on project -> Run -> Run on server -> Select server -> Finish

6. If server doesn't start & it shows a port issue -> Go to CMD -> Run as administrator -> apply following commands to free 8080 port
netstat -ano | findstr 8080
taskkill /F /pid 1088[1088 will differ according to the 1st command's output]



### FOR IMPORTING EXISTING PROJECT

1. File -> import -> Select General -> Select Existing project into Workspace -> next -> In 'Select root directory' browse to select the particular file -> Finish

2. File -> build path -> configure build path -> Go to 'Libraries' -> select 'JRE System Library[jre1.8.0_172](unbound)' -> edit ->  select Workspace default JRE(jre1.8.0_251) -> Finish -> Apply -> Apply & close

3. Go to Server(From bottom menu) -> Define a new server -> Select Apache ->Select Tomcat v8.5 Server -> Provide tomcat installation directory[If we are provided tomcat file also then select that file] -> Finish -> Select Project -> Add-> Finish -> will take some time to build

4. Go to Server(From project directory) -> Tomcat v8.5 Server at localhost.config -> server.xml -> Go to Source(From bottom menu) -> Scroll down go to 'Context' and in path provide base url -> Save

5. Go to WebContent -> index.xml -> in <body> tag type something  for testing.

6. RightClick on project -> Run -> Run on server -> Select server -> Finish
