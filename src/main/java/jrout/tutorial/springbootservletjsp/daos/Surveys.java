package jrout.tutorial.springbootservletjsp.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Surveys {
    // 설문시작
    public void getSurvey(Statement statement) {
        // 이름과 휴대폰 입력 확인

        // 설문과 답항 내용 출력
        String query = "SELECT * FROM questions_list " +
                "ORDER BY ORDERS";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            ResultSet resultSet2;
            ArrayList<String> example_list;
            while (resultSet.next()) {
                // 설문 문항에 맞는 설문 답항 출력
                System.out.print(resultSet.getInt("ORDERS") + ". ");
                System.out.println(resultSet.getString("QUESTIONS"));
                String uid = resultSet.getString("QUESTIONS_UID");
                query = "SELECT example_list.EXAMPLE_UID, example_list.EXAMPLE, example_list.ORDERS " +
                        "FROM answers inner Join example_list " +
                        "       on answers.EXAMPLE_UID = example_list.EXAMPLE_UID " +
                        "       WHERE QUESTIONS_UID = '" + uid + "' " +
                        "ORDER BY ORDERS";
                resultSet2 = statement.executeQuery(query);
                // 설문 답항 출력
                example_list = new ArrayList<String>();
                while (resultSet2.next()) {
                    System.out.print(resultSet2.getInt("ORDERS") + ". ");
                    System.out.println(resultSet2.getString("EXAMPLE"));
                    example_list.add(resultSet2.getString("EXAMPLE_UID"));
                }
                resultSet2.close();
                // int pass = 0;
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}