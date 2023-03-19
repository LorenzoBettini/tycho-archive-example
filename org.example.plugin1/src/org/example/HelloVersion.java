package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.jar.Manifest;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

public class HelloVersion {

	private static class Plugin extends EMFPlugin {
		public static final HelloVersion.Plugin INSTANCE = new HelloVersion.Plugin();

		private Plugin() {
			super(new ResourceLocator[] {});
		}

		@Override
		public ResourceLocator getPluginResourceLocator() {
			return null;
		}
	}

	public static String getBundleVersion() {
		URL baseURL = HelloVersion.Plugin.INSTANCE.getBaseURL();
		try (InputStream is = new URL (baseURL + "META-INF/MANIFEST.MF").openStream()) {
			Manifest manifest = new Manifest(is);
			return manifest.getMainAttributes().getValue("Bundle-Version");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static String getMavenVersion() {
		URL baseURL = HelloVersion.Plugin.INSTANCE.getBaseURL();
		try (InputStream is = new URL (baseURL + "META-INF/MANIFEST.MF").openStream()) {
			Manifest manifest = new Manifest(is);
			return manifest.getMainAttributes().getValue("Maven-Version");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
