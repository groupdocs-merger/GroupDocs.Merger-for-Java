package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeDocmTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeDocm.run(SampleFiles.SAMPLE_DOCM, SampleFiles.SAMPLE_DOCM);
        Assertions.assertThat(result).isNotNull().exists();
    }
}