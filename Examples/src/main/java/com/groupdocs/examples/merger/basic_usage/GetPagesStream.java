package com.groupdocs.examples.merger.basic_usage;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.common.SplitStreamFactory;
import com.groupdocs.merger.domain.options.SplitMode;
import com.groupdocs.merger.domain.options.SplitOptions;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class GetPagesStream {
    public static Map<Integer, ByteArrayOutputStream> run(Path inputFilePath) {
        Map<Integer, ByteArrayOutputStream> outputStreams = new HashMap<>();
        try {
            Merger merger = new Merger(inputFilePath.toString());
            try {
                SplitOptions splitOptions = new SplitOptions(new SplitStreamFactory() {
                    @Override
                    public OutputStream createSplitStream(int pageNumber) {
                        return new ByteArrayOutputStream();
                    }

                    @Override
                    public void closeSplitStream(int pageNumber, OutputStream pageStream) {
                        outputStreams.put(pageNumber, (ByteArrayOutputStream) pageStream);
                    }
                }, new int[]{3, 4}, SplitMode.Pages);

                merger.split(splitOptions);

                System.out.println("..sample finished successfully.");
            } finally {
                merger.dispose();
            }
        } catch (Exception e) {
            FailureRegister.getInstance().registerFailedSample(e);
        }
        return outputStreams;
    }
}