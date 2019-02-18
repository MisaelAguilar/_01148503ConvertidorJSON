package com.edu.mx.practicas.uno.convertidor;

import com.google.gson.Gson;

import org.json.JSONObject;
import org.json.XML;

public class Convertidor {
    /**
     * Metodo para convertir Clase a JSON
     * @param clase texto en formato clase para convertir
     * @return Clase convertida a JSON
     */
    public String convertirClaseToJson(String clase){
        Gson gson = new Gson();
        return gson.toJson(clase);
    }

    /**
     *
     * Metodo para convertir xml a JSON
     * param Xml texto en formato clase para convertir
     * return xml convertida a JSON
     */
    public String convertirXmlToJson(String clase){
        int FORMAT = 4;
        JSONObject xmlJSONObj = XML.toJSONObject(clase);
        return(xmlJSONObj.toString(FORMAT));
    }
}
