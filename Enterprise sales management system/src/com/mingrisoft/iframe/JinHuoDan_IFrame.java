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
	
	private JPanel jContentPane = null;// �������
	private JPanel topPanel = null;// �������
	private JLabel idLabel = null;// ������Ʊ�š���ǩ
	private JTextField idField = null;// ������Ʊ�š��ı���
	private JLabel gysLabel = null;// ����Ӧ�̡���ǩ
	private JLabel lxrLabel = null;// ����ϵ�ˡ���ǩ
	private JTextField lxrField = null;// ����ϵ�ˡ��ı���
	private JLabel jsfsLabel = null;// �����㷽ʽ����ǩ
	private JComboBox jsfsComboBox = null;// �����㷽ʽ�������б�
	private JLabel jhsjLabel = null;// ������ʱ�䡱��ǩ
	private JTextField jhsjField = null;// ������ʱ�䡱�ı���
	private JLabel jsrLabel = null;// �������ˡ���ǩ
	private JTextField czyField = null;// ������Ա���ı���
	private JPanel bottomPanel = null;// �ײ����
	private JLabel pzslLabel = null;// ��Ʒ����������ǩ
	private JTextField pzslField = null;// ��Ʒ���������ı���
	private JLabel hpzsLabel = null;// ����Ʒ��������ǩ
	private JTextField hpzsField = null;// ����Ʒ�������ı���
	private JLabel hjjeLabel = null;// ���ϼƽ���ǩ
	private JTextField hjjeField = null;// ���ϼƽ��ı���
	private JLabel ysjlLabel = null;// �����ս��ۡ���ǩ
	private JTextField ysjlField = null;// �����ս��ۡ��ı���
	private JLabel czyLabel = null;// ������Ա����ǩ
	private JButton tjButton = null;// ����ӡ���ť
	private JButton rukuButton = null;// ����⡱��ť
	private JScrollPane tablePane = null;// ������
	private JTable table = null;// ���ģ��
	private JComboBox spComboBox = null;// ��Ʒ�����б�
	private JComboBox gysComboBox = null;// ����Ӧ�̡������б�
	private JComboBox jsrComboBox = null;// �������ˡ������б�

	private Date jhsjDate = new Date();// �������ڶ���֮������ʱ�䡱

}
