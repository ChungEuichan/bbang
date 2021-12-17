package spms.controller;

import java.util.Map;

import spms.annotation.Component;
import spms.dao.MySqlEventDAO;


@Component("/event/list2.do")
public class EventListController2 implements Controller {
   /*
    * DI(Dependency Injection)
    * 1) Ŭ������ ���յ� ����
    * 2) MemberDAO �������̽��� �����ϰ� ��ӱ����ϹǷν� �ٸ� DBMS���� ��ȯ ����
    * 3) ���߿� ������ �ڵ�ȭ �۾��� ���
    * */
   
   MySqlEventDAO eventDAO = null;
   
   public EventListController2 setProdectDAO(MySqlEventDAO eventDAO) {
      this.eventDAO = eventDAO;
      return this;
   }
   
   @Override
   public String execute(Map<String, Object> model) throws Exception {
      //���ϵ� ��ȸ ��� �ʿ� ����
      model.put("eventList", eventDAO.selectlist2());
      
      return "../baking.jsp";
   }
}