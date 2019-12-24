package com.groupdocs.merger.examples.quick_start;

import com.groupdocs.merger.licensing.metered.Metered;

/**
 * This example demonstrates how to set Metered license.
 * Learn more about Metered license at https://purchase.groupdocs.com/faqs/licensing/metered.
 */
public class SetMeteredLicense {
    public static void run() throws Exception
    {
        String publicKey = "*****";
        String privateKey = "*****";

        Metered metered = new Metered();
        metered.setMeteredKey(publicKey, privateKey);

        // Get amount (MB) consumed
        //double amountConsumed = Metered.getConsumptionQuantity();
        //System.out.print("Amount (MB) consumed: " + amountConsumed);

        // Get count of credits consumed
        //double creditsConsumed = Metered.getConsumptionCredit();
        //System.out.print("Credits consumed: " + creditsConsumed);

        System.out.print("License set successfully.");
    }
}