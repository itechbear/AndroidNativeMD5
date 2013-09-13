AndroidNativeMD5
================

native md5 library for android

This project provides native c implementation of the MD5 algorithm on android platforms. Theoritically it is more efficient than java implementations (I did not do any benchmark myself).

Usage
=====

 - Import this project as a library module
 - Add dependency of this module to your own project/module
 - Now you can use MD5.mdFile() or MD5.mdString()

Credits
=======

The original version of md5.c is taken from [here](http://people.csail.mit.edu/rivest/Md5.c).
