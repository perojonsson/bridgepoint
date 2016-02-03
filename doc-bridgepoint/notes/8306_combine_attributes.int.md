---

This work is licensed under the Creative Commons CC0 License

---

# Combine Attributes with more consistent behaviour
### xtUML Project Implementation Note

1. Abstract
-----------
The combine attributes feature can be used to combine multiple referential attributes.

2. Document References
----------------------  
In this section, list all the documents that the reader may need to refer to.
Give the full path to reference a file.  
<a id="2.1"></a>2.1 [BridgePoint DEI #8306](https://support.onefact.net/issues/8306) Combine referential attributes   

3. Background
-------------  
The behavior of the combine attributes feature depends on in which order you
combine attributes. Consider a class My_Class containing two referential attributes
Attr1 and Attr2 pointing back to the same base attribute. Attr1 is part of an identifier
of My_Class.

If you start the combine operation on Attr1, My_Class will end up with just one attribute, Attr1.

If you start the combine operation on Attr2, My_Class will end up with two attributes.
Attr1 will be converted to an base attribute and still part of the identifier.
Attr2 will be an referential attribute, with all references of the original Attr1 and Attr2.
Under certain conditions, the new Attr1 may get the name "Orphaned". This seems to occur
if the refered to attribute is not a base attribute.

4. Requirements
---------------  

The combine attributes feature should work the same independent of on which attribute
you start the combine, with the exception of the name of the resulting attribute.   

5. Work Required
----------------    
Change to operation combine_refs of Referential Attribute, so that it no longer
converts the other attribute (the attribute combined with) to a base attribute
if it is part of an identifier.
If the other attribute is part of an identifier, add the current attribute to that
identifier, updating all references to point to the current attribute.
If the current attribute and the other attribute is part of the same identifier, just
remove the other attribute from the identifier, since the current attribute is already there.


6. Implementation Comments
--------------------------
None.


7. Unit Test
------------
Execute the current tests covering this functionality, 
CombineSplitReferentialsTestGenerics, updating test results where necessary.

8. Code Changes
---------------
Branch name: 8306_combine_attributes

<pre>

< Put the file list here >

</pre>

End
---

