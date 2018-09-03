
Pre-condition:
- Installed Java JDK, Android studio and Appium server
- Added JAVA_HOME and ANDROID_HOME to Path environment
- Create a emuliator with:
Name: Galaxy_Nexus_API_19 CPU/ABI: Google APIs Intel Atom (x86) Path: C:\Users\tanhtuan\.android\avd\Galaxy_Nexus_API_19.avd Target: google_apis [Google APIs] (API level 19) Skin: galaxy_nexus SD Card: 100 MB hw.dPad: no hw.lcd.height: 1280

Steps to run:
- Create a project on Android studio (e.g. App)
- Import these jar files into libs folder under App/app
Get from https://appium.io/downloads.html
https://docs.seleniumhq.org/download/
+ byte-buddy-1.8.15.jar
+ commons-codec-1.10.jar
+ commons-exec-1.3.jar
+ commons-logging-1.2.jar
+ guava-25.0-jre.jar
+ httpclient-4.5.5.jar
+ httpcore-4.4.9.jar
+ java-client-6.1.0.jar
+ okhttp-3.10.0.jar
+ okio-1.14.1.jar
+ selenium.jar
- Open build.gradle file from Github and copy all lines to build.gradle file under App/app
- Sync build.gradle file
- Create a java class under App/app/src/test/java (e.g. name is FistTest.java)
- Open FistTest.java from Github and copy all lines to FistTest.java under App/app/src/test/java
- Start Appium server with IP: 127.0.0.1:4723
- Start emulator
- Run FistTest.java file

The result: Only launch Chrome browser in emulator, access http://www.demo.guru99.com/v4 and input email/password
The problems: 
- My PC runs too long with android studio, appium and emulator
- Chrome browser in emulator runs too long, cannot continue
- Because of above problems, I cannot complete 3 test cases