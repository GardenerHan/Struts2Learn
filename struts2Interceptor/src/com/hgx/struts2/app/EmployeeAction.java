package com.hgx.struts2.app;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import org.apache.struts2.interceptor.RequestAware;

import java.util.Map;

public class EmployeeAction implements RequestAware,ModelDriven<Employeee>,Preparable{
    private Map<String,Object> requestMap  ;
   // Dao dao = new Dao() ;
    //需要在当前的employeeAction 中定义 employeeId 属性 从而接受请求参数
//    private  Integer employeeId ;
//    private  String firstName;
//    private  String lastName ;
//    private String email ;
    Employeee employeee ;
    public  String list(){
        requestMap.put("emps",Dao.getEmployees()) ;
        return "list" ;
    }
    public String update(){
        Dao.update(employeee);
        return "success" ;
    }
    public void prepareUpdate(){
        employeee = new Employeee() ;
    }
    public String delete(){
        Dao.delete(employeeId);
        //结果的类型应该是重定向 redirectAction
        return "success" ;
    }
    public String save(){
//        Employeee employeee = new Employeee(null,firstName,lastName,email) ;
        Dao.save(employeee);
        return "success" ;
    }
    public void prepareSave(){
        employeee = new Employeee() ;
    }
    public String edit(){
//        Employeee emppp = Dao.get(employeee.getEmployeeId()) ;
//        employeee.setFirstName(emppp.getFirstName());
//        employeee.setLastName(emppp.getLastName());
//        employeee.setEmail(emppp.getEmail());
//        System.out.println(employeee);
        //手动将数据的数据加入到值栈
//        ActionContext.getContext().getValueStack().push(Dao.get(employeee.getEmployeeId()));
        return "edit" ;
    }
    public void prepareEdit(){
        employeee = Dao.get(employeeId) ;
    }
    @Override
    public void setRequest(Map<String, Object> map) {
        requestMap = map ;
    }

    private  Integer employeeId ;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public Employeee getModel() {
        //判断Create还是Edit
        //若为create 则 new
        //若为Edit 则 数据库的数据赋值
        //则需要在modelDriven拦截器栈param
//        if (employeeId == null)
//            employeee = new Employeee() ;
//        else
//            employeee = Dao.get(employeeId) ;
        return employeee ;
    }


    /**
     * prepare 方法的作用: 为getModel()方法准备model的
     * @throws Exception
     */
    @Override
    public void prepare() throws Exception {
//        if (employeeId == null)
//            employeee = new Employeee() ;
//        else
//            employeee = Dao.get(employeeId) ;
//    }
//
//    public String getFirstName() {
//        return firstName;
        System.out.println("prepare....");
    }

//    public void setFirstName(String firstName) {

//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Integer getEmployeeId() {
//        return employeeId;
//    }
//
//    public void setEmployeeId(Integer employeeId) {
//        this.employeeId = employeeId;
//    }

}
