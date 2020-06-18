//package utlilTest;
//
//import javax.xml.stream.XMLEventReader;
//import javax.xml.stream.XMLEventWriter;
//import java.io.StringReader;
//import java.io.StringWriter;
//
//public class StaxonUtils {
//    public static String json2xml(String json) {
//        StringReader input = new StringReader(json);
//        StringWriter output = new StringWriter();
//        JsonXMLConfig config = new JsonXMLConfigBuilder().multiplePI(false).repairingNamespaces(false).build();
//        try {
//            XMLEventReader reader = new JsonXMLInputFactory(config).createXMLEventReader(input);
//            XMLEventWriter writer = XMLOutputFactory.newInstance().createXMLEventWriter(output);
//            writer = new PrettyXMLEventWriter(writer);
//            writer.add(reader);
//            reader.close();
//            writer.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                output.close();
//                input.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return output.toString();
//    }
//
//    /**
//     * @Description: json string convert to xml string ewidepay ues only
//     * @author watermelon_code
//     * @date 2017年7月19日 上午10:50:32
//     */
//    public static String json2xmlPay(String json) {
//        StringReader input = new StringReader(json);
//        StringWriter output = new StringWriter();
//        JsonXMLConfig config = new JsonXMLConfigBuilder().multiplePI(false).repairingNamespaces(false).build();
//        try {
//            XMLEventReader reader = new JsonXMLInputFactory(config).createXMLEventReader(input);
//            XMLEventWriter writer = XMLOutputFactory.newInstance().createXMLEventWriter(output);
//            writer = new PrettyXMLEventWriter(writer);
//            writer.add(reader);
//            reader.close();
//            writer.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                output.close();
//                input.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        if (output.toString().length() >= 38) {// remove <?xml version="1.0" encoding="UTF-8"?>
//            return "<xml>" + output.toString().substring(39) + "</xml>";
//        }
//        return output.toString();
//    }
//
//    /**
//     * @Description: xml string convert to json string
//     * @author watermelon_code
//     * @date 2017年7月19日 上午10:50:46
//     */
//    public static String xml2json(String xml) {
//        StringReader input = new StringReader(xml);
//        StringWriter output = new StringWriter();
//        JsonXMLConfig config = new JsonXMLConfigBuilder().autoArray(true).autoPrimitive(true).prettyPrint(true).build();
//        try {
//            XMLEventReader reader = XMLInputFactory.newInstance().createXMLEventReader(input);
//            XMLEventWriter writer = new JsonXMLOutputFactory(config).createXMLEventWriter(output);
//            writer.add(reader);
//            reader.close();
//            writer.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                output.close();
//                input.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return output.toString();
//    }
//
//    /**
//     * @Description: 去掉转换xml之后的换行和空格
//     * @author watermelon_code
//     * @date 2017年8月9日 下午4:05:44
//     */
//    public static String json2xmlReplaceBlank(String json) {
//        String str = StaxonUtils.json2xml(json);
//        String dest = "";
//        if (str != null) {
//            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
//            Matcher m = p.matcher(str);
//            dest = m.replaceAll("");
//        }
//        return dest;
//    }
//}
