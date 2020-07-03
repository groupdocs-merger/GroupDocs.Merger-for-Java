---
id: groupdocs-merger-for-java-19-12-release-notes
url: merger/java/groupdocs-merger-for-java-19-12-release-notes
title: GroupDocs.Merger for Java 19.12 Release Notes
weight: 1
description: ""
keywords: 
productName: GroupDocs.Merger for Java
hideChildren: False
---
{{< alert style="info" >}}This page contains release notes for GroupDocs.Merger for Java 19.12{{< /alert >}}

## Major Features

{{< alert style="danger" >}}In this version we're introducing new public API which was designed to be simple and easy to use. For more details about new API please check Developer Guide section. The legacy API have been moved into legacy namespace so after update to this version it is required to make project-wide replacement of namespace usages from groupdocs.merger. to groupdocs.merger.legacy. to resolve build issues.{{< /alert >}}

  
Other notable features:

*   Removed support of image joining;
*   Added support of MHT format.
*   Fixed the XLSB format loading with Unknown FileType;
*   Fixed merging of the ODP files with empty table;
*   Added Encoding usage of LoadOptions to the text splitting.

## Full List of Issues Covering all Changes in this Release

| Key | Summary | Category |
| --- | --- | --- |
| MERGERNET-415 | Implement a new format MHT | Feature |
| MERGERNET-602 | Implement a new API of GroupDocs.Merger for .NET product | Feature |
| MERGERNET-668 | Add LoadOptions Encoding usage for the text splitting | Improvement |
| MERGERNET-655 | Format XLSB is not load with Unknown FileType | Bug |
| MERGERNET-686 | Cannot merge ODP files with table | Bug |

## Public API and Backward Incompatible Changes

*   #### All public types from groupdocs.merger namespace 
    
    1.  Have been moved into **groupdocs.merger.legacy** namespace
    2.  Marked as **obsolete** with message: *This interface/class/enumeration is obsolete and will be available till January 2020 (v20.1).*
*   #### Full list of namespaces which have been moved and marked as obsolete:    
    1.  groupdocs.merger.handler => groupdocs.merger.legacy.handler        
    2.  groupdocs.merger.domain => groupdocs.merger.legacy.domain        
    3.  groupdocs.merger.domain.format => groupdocs.merger.legacy.domain.format        
    4.  groupdocs.merger.domain.image => groupdocs.merger.legacy.domain.image        
    5.  groupdocs.merger.domain.options => groupdocs.merger.legacy.domain.options        
    6.  groupdocs.merger.domain.result => groupdocs.merger.legacy.domain.result        
    7.  groupdocs.merger.domain.security => groupdocs.merger.legacy.domain.security