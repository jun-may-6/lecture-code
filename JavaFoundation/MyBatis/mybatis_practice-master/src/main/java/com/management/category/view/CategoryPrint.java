package com.management.category.view;

import com.management.category.model.dto.CategoryDTO;

import java.util.List;
import java.util.Map;

public class CategoryPrint {

    // * 모든 출력은 System.out.println()을 통해 콘솔에 출력하는 것을 의미합니다.
    // * 주석을 지우고 다음 세 가지 메소드를 작성하세요.

    public void printTeamList(List<CategoryDTO> categoryList, Map<String, String> parameter) {

        if(parameter.get("option").equals("orderList")){
            System.out.println("==== 순위별 제품 분류 조회 ====");
        } else if(parameter.get("option").equals("allList")) {
            System.out.println("==== 전체 목록 조회 ====");
        }

        if(categoryList != null && categoryList.size() > 0){
            for(CategoryDTO category : categoryList){
                System.out.println(category);
            }
        }

        // 1. 조회한 목록 출력하는 메소드
        //    (조건 1) HashMap 타입의 매개변수로 받아온 값을 기준으로 전체 목록 조회인지, 순위별 제품분류 조회인지 구분하여 출력하세요.
        //    (조건 2) List<CategoryDTO>로 받아온 데이터 목록을 전체 출력하세요.

    }

    public void printSuccessMessage(String successCode) {

        // 2. 성공메시지를 출력하는 메소드
        //    (조건) 성공코드를 전달받아 각각의 요청에 대해 성공을 알리는 메시지를 출력하세요.
        switch (successCode){
            case "categorySelect" :
                System.out.println("==== 카테고리 정보를 가져오는데 성공했습니다. ===="); break;
            case "registCategory" :
                System.out.println("==== 카테고리 등록에 성공하였습니다. ===="); break;
        }
    }

    public void printErrorMessage(String errorCode) {

        // 3. 에러메시지를 출력하는 메소드
        //    (조건) 에러코드를 전달받아 각각의 요청에 대해 에러를 알리는 메시지를 출력하세요.
        switch (errorCode){
            case "categorySelect" :
                System.out.println("==== 카테고리 정보를 가져오는데 실패했습니다. ===="); break;
            case "registerCategory" :
                System.out.println("==== 카테고리 등록에 실패하였습니다. ===="); break;
        }

    }

}
