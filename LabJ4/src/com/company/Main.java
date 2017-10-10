package com.company;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.xml.sax.*;
import org.w3c.dom.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
	   String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
               "<!DOCTYPE roles SYSTEM \"roles.dtd\">\n" +
               "<roles>\n" +
               "    <role1>User</role1>\n" +
               "    <role2>Author</role2>\n" +
               "    <role3>Admin</role3>\n" +
               "    <role4/>\n" +
               "</roles>";
	     XMLHelper h = new XMLHelper();
        h.readXML(xml);
    }
}
