//package utlilTest;
//
//import com.alibaba.fastjson.serializer.JSONSerializer;
//import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
//
//import java.util.Map;
//
//public class XmlJsonUtils {
//    /**
//     * JSON(数组)字符串转换成XML字符串
//     * （必须引入 xom-1.1.jar）
//     * @param jsonString
//     * @return
//     */
//    public static String json2xml(String jsonString) {
//        XMLSerializer xmlSerializer = new XMLSerializer();
//        xmlSerializer.setTypeHintsEnabled(false); // 去除 节点中type类型
//        String xml = xmlSerializer.write(JSONSerializer.toJSON(jsonString));
//        xml = xml.replace("<o>", "").replace("</o>", "");
//        xml = xml.replaceAll("\r\n", "").concat("\r\n");
//        return xml;
//    }
//    /**
//     * xml 转 json
//     * @param xmlString xml字符串
//     * @return
//     */
////    public static String xml2json(String xmlString) {
////        Map<String, Object> map = XmlMapUtils.xmlToMap(xmlString);
////        String json = JsonToMap.mapToJson(map);
////        return json;
////    }
//}
