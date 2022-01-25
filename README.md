# MVC-Examples

#### Example:1 DATAViewMvc 
## ! .Data sending Controller to UI
## !!.Data sending UI to Controller
#### HERE WE PASSING DATA FROM CONTROLLER TO UI
#### +++++++++++++++++++++++++++++++++++++++++++++++
####  1. create a method in controller level
#### set the data by using "Model" 
### MODEL (model map for sharing the data)
#### model is nothing but passing the data from CONTROLLER end to UI 
#### and setting the data from controller method passed modelattribute
# 1.Example
##### //No need to take domain class to set the data we are setting the data by using Model(UI) 
##### @RequestMapping("/data")
##### public String data(Model m) {

##### m.addAttribute("sno",1);
##### m.addAttribute("name","Ram");/*setting the data like this setting sending the data from controller to UI by Model*/
##### m.addAttribute("office","olivecrypto");
##### return "one";

### BY USING OBJECT WE CREATED ONE MODEL CLASS
##### pass the data in it in controller level 
##### !)write the object in side the method and pass the data 
##### ADD that passed data to ::::MODEL MAP:::: 
##### EXAMPLE LIKE THIS 
##### model.addAttribute("ob",mvc);
##### same as this we need to give "ob" in dollar symbol
# 2.Example
##### //Here i would like to set the data by using Domain class
##### @RequestMapping("/show")
##### 	public String data1(Model model) {
##### ->Mvcmodel mvc=new Mvcmodel(1,"Ramu","OLIVE CRYPTO SYSTEMS PVT LMTD");
##### 	model.addAttribute("ob",mvc);
##### 	return "two";

## !!.Data sending UI to Controller
#### PASSING THE DATA FROM UI TO CONTROLLER
#### * =====================================
#### * EXAMPLE:::1
#### 1.create a method and give a pass the @Requestparam in it
#### 2.Give in it "key" value and "datatype" and "local variable"
####           ("empname"),      (String)        (name)
#### 3.key is nothing but an object with this object we need to pass the data then will comes to the browser
#### * http://localhost:8080/showdash?empname=RAMIt
## 3.Example
#### 	public String dataview(@RequestParam("ename")String name,Model model) {
#### 	model.addAttribute("ename",name);
#### 		return "ram";


# 3.Example
#### Here created two methods
#### One for get the text box to take the data 
#### One for read the data from that text box
#### Example(!)
#### 1.One for get the text box to take the data
##### 	@RequestMapping(value="/data")
##### 	public String showdashboard(){
##### 	return "home";
#### Example(!!)
#### 2.One for read the data from that text box
##### @RequestMapping(value="/showdash")
##### 	public String showsendeddata(@RequestParam("empname")String name,Model model) {
##### 	model.addAttribute("empname",name);
#####   return "showmvc";

		
