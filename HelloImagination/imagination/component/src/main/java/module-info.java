module com.sixmops.component {
	requires transitive java.json;
	//requires transitive org.glassfish.java.json;
	requires java.base;
	requires java.net.http;
    //requires transitive javafx.controls;
	exports com.sixmops.component;
}