/**
 * 
 */
package com.ys.spring.helloMVC.dto;

import java.util.Map;

/**
 * @author shashantp
 *
 */
public class JSONResponse {

        private String status = null;
        private Object result = null;
        private Map<String,String> errorMap;
        private PersonDTO personDTO = new PersonDTO();
        
        public Map<String, String> getErrorMap() {
			return errorMap;
		}
		public void setErrorMap(Map<String, String> errorMap) {
			this.errorMap = errorMap;
		}
		public PersonDTO getPersonDTO() {
			return personDTO;
		}
		public void setPersonDTO(PersonDTO personDTO) {
			this.personDTO = personDTO;
		}
		public String getStatus() {
                return status;
        }
        public void setStatus(String status) {
                this.status = status;
        }
        public Object getResult() {
                return result;
        }
        public void setResult(Object result) {
                this.result = result;
        }

}
