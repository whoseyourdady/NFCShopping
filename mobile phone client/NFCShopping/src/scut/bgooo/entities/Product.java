package scut.bgooo.entities;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

/**
 * 商品信息实体类
 * 
 * 2012年4月1日 调试成功的类
 * 
 * 
 * */
public class Product implements KvmSerializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String EntityKey;
	private int Id; // 商品id
	private String Barcode; // 商品的条形码编号
	private String Name; // 商品名
	private String Price; // 商品价格
	private int SecCategoryID;
	private String Brand;
	private String Location;
	private String ImpageURL;
	private String Description;

	private SecCategory SecCategory;

	@Override
	public Object getProperty(int arg0) {
		// TODO Auto-generated method stub
		Object res = null;
		switch (arg0) {
		case 0:
			res = this.Id;
			break;
		case 1:
			res = this.Barcode;
			break;
		case 2:
			res = this.Name;
			break;
		case 3:
			res = this.Price;
			break;
		case 4:
			res = this.SecCategoryID;
			break;
		case 5:
			res = this.Brand;
			break;
		case 6:
			res = this.Location;
			break;
		case 7:
			res = this.ImpageURL;
			break;
		case 8:
			res = this.Description;
			break;
		case 9:
			res = this.EntityKey;
			break;
		case 10:
			res = this.SecCategory;
			break;
		default:
			break;
		}
		return res;
	}

	@Override
	public int getPropertyCount() {
		// TODO Auto-generated method stub
		return 11;
	}

	@Override
	public void getPropertyInfo(int arg0, Hashtable arg1, PropertyInfo arg2) {
		// TODO Auto-generated method stub
		switch (arg0) {
		case 0:
			arg2.type = PropertyInfo.INTEGER_CLASS;
			arg2.name = "productID";
			break;
		case 1:
			arg2.type = PropertyInfo.STRING_CLASS;
			arg2.name = "barCode";
			break;
		case 2:
			arg2.type = PropertyInfo.STRING_CLASS;
			arg2.name = "productName";
			break;
		case 3:
			arg2.type = PropertyInfo.STRING_CLASS;
			arg2.name = "price";
			break;
		case 4:
			arg2.type = PropertyInfo.INTEGER_CLASS;
			arg2.name = "secCategoryID";
			break;
		case 5:
			arg2.type = PropertyInfo.STRING_CLASS;
			arg2.name = "brand";
			break;
		case 6:
			arg2.type = PropertyInfo.STRING_CLASS;
			arg2.name = "location";
			break;
		case 7:
			arg2.type = PropertyInfo.STRING_CLASS;
			arg2.name = "imageURL";
			break;
		case 8:
			arg2.type = PropertyInfo.STRING_CLASS;
			arg2.name = "description";
			break;
		case 9:
			arg2.type = PropertyInfo.STRING_CLASS;
			arg2.name = "EntityKey";
			break;
		case 10:
			arg2.type = PropertyInfo.OBJECT_CLASS;
			arg2.name = "SecCategory";
			break;
		default:
			break;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void setProperty(int arg0, Object arg1) {
		// TODO Auto-generated method stub
		if (arg1 == null)
			return;
		switch (arg0) {
		case 0:
			this.Id = Integer.valueOf(arg1.toString());
			break;
		case 1:
			this.Barcode = arg1.toString();
			break;
		case 2:
			this.Name = arg1.toString();
			break;
		case 3:
			this.Price = arg1.toString();
			break;
		case 4:
			this.SecCategoryID = Integer.valueOf(arg1.toString());
			break;
		case 5:
			this.Brand = arg1.toString();
			break;
		case 6:
			this.Location = arg1.toString();
			break;
		case 7:
			this.ImpageURL = arg1.toString();
			break;
		case 8:
			this.Description = arg1.toString();
			break;
		case 9:
			this.EntityKey = arg1.toString();
			break;
		case 10:
			this.SecCategory = (SecCategory) arg1;
			break;
		default:
			break;
		}
	}
}
