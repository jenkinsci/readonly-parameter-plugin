readonly-parameter-plugin
=======================

##Characteristics
		1. Some key parameters, once modified in the build execution, can lead to the risk.these parameters,only administrator can modify,to reduce the risk.
		2. Readonly parameter,readonly in the build execution, in job configuration's page can modify.
		3. Readonly parameter,readonly in the rebuild excution also.
		4. This plugin contains string and text two readonly style.

##Use case
After the plugin is installed,in job configuration's page,you can see readonly Parameter:<br>
![](https://github.com/wy-scm/readonly-parameter/raw/master/images/add_para.png)

for example,you add two readonly parameter,respectively called readonly_para_str and readonly_para_text.<br>
![](https://github.com/wy-scm/readonly-parameter/raw/master/images/edit_para.png)

click 'Build With Parameters' link ,the parameter readonly_para_str and readonly_para_text of the set before ,display readonly,and can not be edited in this page. <br>
![](https://github.com/wy-scm/readonly-parameter/raw/master/images/build_para.png)
