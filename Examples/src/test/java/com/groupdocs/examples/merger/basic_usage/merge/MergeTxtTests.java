package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeTxtTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeTxt.run(SampleFiles.SAMPLE_TXT, SampleFiles.SAMPLE_TXT);
        Assertions.assertThat(result).isNotNull().exists();
    }
}