package com.groupdocs.merger.examples.basic_usage;


import com.groupdocs.merger.domain.FileType;

import java.util.List;

/**
 * This example demonstrates how to obtain all supported file types.
 */
public class GetSupportedFileTypes {
    public static void run()
    {
        List<FileType> fileTypes = FileType.getSupportedFileTypes();

        for(FileType fileType : fileTypes)
        {
            System.out.print(fileType.getExtension());
        }

        System.out.print("Supported file types retrieved successfully.");
    }
}