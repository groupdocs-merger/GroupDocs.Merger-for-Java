package com.groupdocs.examples.merger.basic_usage;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.util.Map;

class GetPagesStreamTests extends TestsSetUp {


    @Test
    void testRun() {
        Map<Integer, ByteArrayOutputStream> result = GetPagesStream.run(SampleFiles.SAMPLE_DOCX_10_PAGES);
        Assertions.assertThat(result).isNotNull();
    }
}