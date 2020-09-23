package com.mingrisoft.iframe;

import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.util.List;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.table.*;

import com.mingrisoft.*;
import com.mingrisoft.dao.Dao;
import com.mingrisoft.dao.model.*;

public class JinHuoDan_IFrame extends JInternalFrame {
	
	private JPanel jContentPane = null;// 内容面板
	private JPanel topPanel = null;// 顶部面板
	private JLabel idLabel = null;// “进货票号”标签
	private JTextField idField = null;// “进货票号”文本框
	private JLabel gysLabel = null;// “供应商”标签
	private JLabel lxrLabel = null;// “联系人”标签
	private JTextField lxrField = null;// “联系人”文本框
	private JLabel jsfsLabel = null;// “结算方式”标签
	private JComboBox jsfsComboBox = null;// “结算方式”下拉列表
	private JLabel jhsjLabel = null;// “进货时间”标签
	private JTextField jhsjField = null;// “进货时间”文本框
	private JLabel jsrLabel = null;// “经手人”标签
	private JTextField czyField = null;// “操作员”文本框
	private JPanel bottomPanel = null;// 底部面板
	private JLabel pzslLabel = null;// “品种数量”标签
	private JTextField pzslField = null;// “品种数量”文本框
	private JLabel hpzsLabel = null;// “货品总数”标签
	private JTextField hpzsField = null;// “货品总数”文本框
	private JLabel hjjeLabel = null;// “合计金额”标签
	private JTextField hjjeField = null;// “合计金额”文本框
	private JLabel ysjlLabel = null;// “验收结论”标签
	private JTextField ysjlField = null;// “验收结论”文本框
	private JLabel czyLabel = null;// “操作员”标签
	private JButton tjButton = null;// “添加”按钮
	private JButton rukuButton = null;// “入库”按钮
	private JScrollPane tablePane = null;// 表格面板
	private JTable table = null;// 表格模型
	private JComboBox spComboBox = null;// 商品下拉列表
	private JComboBox gysComboBox = null;// “供应商”下拉列表
	private JComboBox jsrComboBox = null;// “经手人”下拉列表

	private Date jhsjDate = new Date();// 创建日期对象之“进货时间”

}
