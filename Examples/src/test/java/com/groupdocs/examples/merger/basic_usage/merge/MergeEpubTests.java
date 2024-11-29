package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeEpubTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeEpub.run(SampleFiles.SAMPLE_EPUB, SampleFiles.SAMPLE_EPUB);
        Assertions.assertThat(result).isNotNull().exists();
    }
}