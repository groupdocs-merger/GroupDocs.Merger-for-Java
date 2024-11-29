package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeEmfTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeEmf.run(SampleFiles.SAMPLE_EMF, SampleFiles.SAMPLE_EMF);
        Assertions.assertThat(result).isNotNull().exists();
    }
}