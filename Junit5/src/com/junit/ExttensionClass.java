package com.junit;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class ExttensionClass implements ExecutionCondition{

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {

		System.out.println(System.getProperty("user.dir")+"/resources/config.properties");

		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(System.getProperty("user.dir")+"/resources/config.properties"));
			System.out.println(properties.getProperty("env"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String strEnv = properties.getProperty("env");
		if (strEnv.equals("dev")) {
				return ConditionEvaluationResult.disabled("Cannot test on Dev");
		}
		else  {
			return ConditionEvaluationResult.enabled("Can  test on Test env");
		}

	}
}
