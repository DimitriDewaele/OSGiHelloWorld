# OSGi Hello World #

## Reference ##

Reference document for OSGI at JavaWorld.com - Hello World example.

[http://www.javaworld.com/article/2077837/java-se/hello--osgi--part-1--bundles-for-beginners.html](http://www.javaworld.com/article/2077837/java-se/hello--osgi--part-1--bundles-for-beginners.html "JavaWorld.com - Hello World")

## Bundles ##

* HelloWorld
* HelloService: Will be imported by HellWorld
* StockService: idem

## Starting Up ##

Eclipse >> Windows >> Preferences >> Plug-in Development >> Target Platform:

You need an target platform.

Eclipse >> Run >> Run Configurations >> OSGI Framework:

Create a new framework - or open your already existing one.

Click Run to start the OSGI container. Eclipse will open the container in the console window.

When problems occur:

 * Use the OSGi console:
 * ss: display all bundles and look at pottential problems.
 * start xxx: try to start bundles that are not active.
 * Also try to remove a OSGi framework and create a new again. 

## OSGi console

Commands:

* ss: Displays list of bundles
* start <bundleid>
* stop <bundleid>
* update <bundleid>
* install <bundleurl>
* uninstall <bundleid>