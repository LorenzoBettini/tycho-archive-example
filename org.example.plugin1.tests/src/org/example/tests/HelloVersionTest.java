package org.example.tests;

import static org.junit.Assert.assertTrue;

import org.example.HelloVersion;
import org.junit.Test;

/**
 * @author Lorenzo Bettini
 *
 * This must be run with tycho-surefire-plugin
 */
public class HelloVersionTest {

	@Test
	public void testVersions() {
		String bundleVersion = HelloVersion.getBundleVersion();
		String mavenVersion = HelloVersion.getMavenVersion();

		System.out.println("Bundle-Version: " + bundleVersion);
		System.out.println("Maven-Version: " + mavenVersion);

		String expectedPrefixVersion = "1.0.0";
		String expectedPrefixTimestamp = "v20";
		assertTrue("expected starting with " + expectedPrefixVersion,
			bundleVersion.startsWith(expectedPrefixVersion));
		assertTrue("expected containing with timestamp " + expectedPrefixTimestamp,
			bundleVersion.contains(expectedPrefixTimestamp));
	}

}
