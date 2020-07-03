---
id: migration-notes
url: merger/java/migration-notes
title: Migration Notes
weight: 3
description: ""
keywords: 
productName: GroupDocs.Merger for Java
hideChildren: False
---
### Why To Migrate?  
Here are the key reasons to use the new updated API provided by GroupDocs.Merger for Java since version 19.12:
*   [Merger](https://apireference.groupdocs.com/merger/java/com.groupdocs.merger/Merger) class introduced as a **single entry point** to manage the document processing of any supported file format (instead of **DocumentHander** class from previous versions).     
*   Product architecture was redesigned from scratch in order to **decreased memory usage** (from 10% to 400% approx. depending on document type).    
*   Document processing **API simplified and improved** so it’s easy to instantiate proper options class and control over document structure manipulation processes.    

### How To Migrate?
Here is a brief comparison of how to join documents using old and new API.  

**Old coding style**

```java
// Preparing.
String password = "SomePasswordString";

InputStream documentExample1 = new FileInputStream("c:\\sample1.docx");
InputStream documentExample2 = new FileInputStream("c:\\sample2.docx");

List<JoinItem> documentStreams = new ArrayList<JoinItem>();

JoinItem item1 = new JoinItem(documentExample1, FileFormat.Pdf, password);
documentStreams.add(item1);

JoinItem item2 = new JoinItem(documentExample2, FileFormat.Pdf, password);
documentStreams.add(item2);

// Main method.
DocumentResult result = new DocumentHandler().join(documentStreams);
OutputStream documentStream = result.getStream();

ByteArrayOutputStream byteArrayStream = (ByteArrayOutputStream) documentStream;
byte[] bytes = byteArrayStream.toByteArray();

FileOutputStream fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
fos.write(bytes, 0, bytes.length);
fos.close();
```

**New coding style**

```java
Merger merger = new Merger("c:\\sample1.docx")
merger.join("c:\\sample2.docx");
merger.save("c:\\output\\result.docx");
```

For more code examples and specific use cases please refer to our [Developer Guide]({{< ref "merger/java/developer-guide/_index.md" >}}) documentation or [GitHub](https://github.com/groupdocs-merger/GroupDocs.Merger-for-Java) samples and showcases.
