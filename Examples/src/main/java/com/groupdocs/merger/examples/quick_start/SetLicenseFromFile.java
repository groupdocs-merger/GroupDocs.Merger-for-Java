package com.groupdocs.merger.examples.quick_start;

import com.groupdocs.merger.examples.Constants;
import com.groupdocs.merger.licensing.License;

import java.io.File;

/**
 * This example demonstrates how to set license from file.
 *
 * The SetLicense method attempts to set a license from several locations relative to the executable and GroupDocs.Merger.jar.
 * You can also use the additional overload to load a license from a stream, this is useful for instance when the
 * License is stored as an embedded resource.
 */
public class SetLicenseFromFile {

    public static void run()
    {

        File file = new File("E:\\Lisbon\\Java_products\\License_Unlimited\\Conholdate.Total.Product.Family.lic");
        if (file.exists() && !file.isDirectory())
        {
            License license = new License();
            license.setLicense("E:\\Lisbon\\Java_products\\License_Unlimited\\Conholdate.Total.Product.Family.lic");

            System.out.print("License set successfully.");
        }
        else
        {
            System.out.print("\nWe do not ship any license with this example. " +
                    "\nVisit the GroupDocs site to obtain either a temporary or permanent license. " +
                    "\nLearn more about licensing at https://purchase.groupdocs.com/faqs/licensing. " +
                    "\nLear how to request temporary license at https://purchase.groupdocs.com/temporary-license.");
        }
    }
}