package Precondition;

import com.gurock.testrail.APIClient;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static Precondition.Constans.TESTRAIL_PASSWORD;
import static Precondition.Constans.TESTRAIL_URL;
import static Precondition.Constans.TESTRAIL_USER;

public class TestRailConf {
    public static APIClient get_api_client() throws Exception
    {
        APIClient client = new APIClient(TESTRAIL_URL);
        client.setUser(TESTRAIL_USER);
        client.setPassword(TESTRAIL_PASSWORD);
        return client;
    }

    public static void  get_tests_in_run(String run_id) throws Exception {
        APIClient  client = get_api_client();
        Object cases =  client.sendGet("get_tests/168");
        JSONObject c = (JSONObject) client.sendGet("get_case/14327");
        System.out.println(c.get("title"));
    }



    public static void  update_testrail(Integer case_id,Integer run_id,boolean result_flag) throws Exception {
        APIClient client = get_api_client();
        Integer status_id = 1;
        if (result_flag)
        {
            status_id = 1 ;
        }
         else
        {
            status_id = 5 ;
        }
        String msg = update_result_message(result_flag);
        Map<String, java.io.Serializable> data = new HashMap<String, java.io.Serializable>();
        data.put("status_id", status_id);
        data.put("comment", msg);
        JSONObject r = (JSONObject)client.sendPost(String.format("add_result_for_case/%s/%s", run_id, case_id),      data);

        System.out.print(String.format("Updated test result for case: %s in test run: %s with msg:%s", case_id, run_id, msg));
    }


    public static String update_result_message(boolean result_flag)
    {
        String msg ="";
        if (result_flag)
        {
             msg = "Successfully updated the example form";
        }
            else
                {
             msg = "Failed to update the example form";
                }
        return msg;
    }

}
