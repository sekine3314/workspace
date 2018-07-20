package com.example.demo;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
public class WebForm {
	private static final long serialVersionUID = 109090L;
    @NotNull
    @Size(min = 1)
    private String inputPid;


    @Size(min = 6,max=20)
     private String inputPwd;


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
