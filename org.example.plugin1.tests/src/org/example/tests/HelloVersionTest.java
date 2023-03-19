package org.example.tests;

import org.example.HelloVersion;
import org.junit.Test;


public class HelloVersionTest {

	@Test
	public void testVersions() {
		String bundleVersion = HelloVersion.getBundleVersion();
		String mavenVersion = HelloVersion.getMavenVersion();

		System.out.println("Bundle-Version: " + bundleVersion);
		System.out.println("Maven-Version: " + mavenVersion);
	}

}
