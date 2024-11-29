package com.groupdocs.examples.merger.quick_start;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class HelloWorldTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = HelloWorld.run(SampleFiles.SAMPLE_DOCX, SampleFiles.SAMPLE2_DOCX);
        Assertions.assertThat(result).isNotNull().exists();
    }
}