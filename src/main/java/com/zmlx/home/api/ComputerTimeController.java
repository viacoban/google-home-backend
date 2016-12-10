package com.zmlx.home.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by viacoban on 12/10/16.
 */
@RestController
@RequestMapping("/computer-time")
public class ComputerTimeController {

    @RequestMapping(value = "is-time", method = RequestMethod.POST)
    public TimeResponse computerTimeCheck() {
        TimeResponse response = new TimeResponse();
        response.setSpeech("Not, yet.");
        response.setDisplayText("Not yet.");
        response.setSource("google");
        return response;
    }

    public static final class TimeResponse {
        private String speech;
        private String displayText;
        private Map<String, Object> data = new HashMap<>();
        private List<String> contextOut = new LinkedList<>();
        private String source;

        public String getSpeech() {
            return speech;
        }

        public void setSpeech(String speech) {
            this.speech = speech;
        }

        public String getDisplayText() {
            return displayText;
        }

        public void setDisplayText(String displayText) {
            this.displayText = displayText;
        }

        public Map<String, Object> getData() {
            return data;
        }

        public void setData(Map<String, Object> data) {
            this.data = data;
        }

        public List<String> getContextOut() {
            return contextOut;
        }

        public void setContextOut(List<String> contextOut) {
            this.contextOut = contextOut;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }
    }

}
