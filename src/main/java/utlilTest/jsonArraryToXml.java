//package utlilTest;
//
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//
//import javax.lang.model.element.Element;
//
//public class jsonArraryToXml {
//    public static void jsonArrayToXml(JSONArray jsonArray, Element childrenElement) {
//        // 遍历json数组：[{"hello":"nihao","hey":"hai","world":[{"c":"cat","d":"dog","e":"elepahant"}]}]
//        for (int i = 0; i < jsonArray.size(); i++) {
//            // 以此例子为例：第一次遍历获取jsonArray.get(i)
//            // {"hello":"nihao","hey":"hai","world":[{"c":"cat","d":"dog","e":"elepahant"}]}
//            // 第二次遍历：{"c":"cat","d":"dog","e":"elepahant"}
//            // 将或得到的Object类型的字符串转化为json格式
//            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
//            // 继续遍历
//            for (String key : jsonObject.keySet()) {
//                Element addElement = childrenElement.addElement(key);
//                Object arry = JSON.toJSON(jsonObject.get(key));
//                if (arry instanceof JSONArray) {
//                    // 递归
//                    jsonArrayToXml((JSONArray) arry, addElement);
//                } else {
//                    addElement.addAttribute("value", jsonObject.get(key).toString());
//                }
//            }
//        }
//    }
//}
