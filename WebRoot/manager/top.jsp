<%@page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@page import="java.util.*,java.text.*" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>无标题文档</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.STYLE1 {
	font-size: 12px;
	color: #FFFFFF;
}
.STYLE2 {font-size: 9px}
.STYLE3 {
	color: #033d61;
	font-size: 12px;
}
 .s1{
  color: green;
  font-size: 15px;
 }
-->
</style>
</head>

<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="70" background="../images/managerPic/images/main_05.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="24"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="270" height="24" background="../images/managerPic/images/main_03.gif">&nbsp;</td>
            <td width="505" background="../images/managerPic/images/main_04.gif">&nbsp;</td>
            <td>&nbsp;</td>
            <td width="21"><img src="../images/managerPic/images/main_07.gif" width="21" height="24"></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="38"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="200" height="38" background="../images/managerPic/images/dangmain.png">&nbsp;</td>
            <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="77%" height="25" valign="bottom"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="50" height="19"><div align="center"><img src="../images/managerPic/images/main_12.gif" width="49" height="19"></div></td>
                    <td width="50"><div align="center"><img src="../images/managerPic/images/main_14.gif" width="48" height="19"></div></td>
                    <td width="50"><div align="center"><img src="../images/managerPic/images/main_16.gif" width="48" height="19"></div></td>
                    <td width="50"><div align="center"><img src="../images/managerPic/images/main_18.gif" width="48" height="19"></div></td>
                    <td width="50"><div align="center"><a href="/dangdang/main/main.jsp" target="_parent"><img src="../images/managerPic/images/main_20.gif" width="48" height="19"></a></div></td>
                    <td width="26"><div align="center"><img src="../images/managerPic/images/main_21.gif" width="26" height="19"></div></td>
                    <td width="100"><div align="center"><img src="../images/managerPic/images/main_22.gif" width="98" height="19"></div></td>
                    <td>&nbsp;</td>
                  </tr>
                </table></td>
                <td width="220" valign="bottom"  nowrap="nowrap"><div align="right"><span class="STYLE1">欢迎管理员：<span class="s1">admin&nbsp;&nbsp;</span><span class="STYLE2">■</span> 今天是：
                <%
                Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				out.println(sdf.format(date));
                 %>
                </span></div></td>
              </tr>
            </table></td>
            <td width="21"><img src="../images/managerPic/images/main_11.gif" width="21" height="38"></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="8" style=" line-height:8px;"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="270" background="../images/managerPic/images/main_29.gif" style=" line-height:8px;">&nbsp;</td>
            <td width="505" background="../images/managerPic/images/main_30.gif" style=" line-height:8px;">&nbsp;</td>
            <td style=" line-height:8px;">&nbsp;</td>
            <td width="21" style=" line-height:8px;"><img src="../images/managerPic/images/main_31.gif" width="21" height="8"></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="28" background="../images/managerPic/images/main_36.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="177" height="28" background="../images/managerPic/images/main_32.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="20%"  height="22">&nbsp;</td>
            <td width="21%">&nbsp;</td>
          </tr>
        </table></td>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="65" height="28"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td height="23" valign="bottom"><table width="58" border="0" align="center" cellpadding="0" cellspacing="0">
                </table></td>
              </tr>
            </table></td>
            <td width="3"><img src="../images/managerPic/images/main_34.gif" width="3" height="28"></td>         
            <td>&nbsp;</td>
          </tr>
        </table></td>
        <td width="21"><img src="../images/managerPic/images/main_37.gif" width="21" height="28"></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
