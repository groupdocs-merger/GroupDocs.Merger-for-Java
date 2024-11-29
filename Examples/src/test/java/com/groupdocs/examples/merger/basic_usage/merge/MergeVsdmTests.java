package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeVsdmTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeVsdm.run(SampleFiles.SAMPLE_VSDM, SampleFiles.SAMPLE_VSDM);
        Assertions.assertThat(result).isNotNull().exists();
    }
}