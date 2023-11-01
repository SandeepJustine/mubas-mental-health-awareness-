package com.mubas.mybrain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import de.hdodenhof.circleimageview.*;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.OnProgressListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Continuation;
import android.net.Uri;
import java.io.File;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.content.Intent;
import android.provider.MediaStore;
import android.os.Build;
import androidx.core.content.FileProvider;
import android.content.ClipData;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseAuth;
import android.view.View;
import android.text.Editable;
import android.text.TextWatcher;
import com.bumptech.glide.Glide;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;


public class ChatFragmentActivity extends  Fragment  { 
	
	public final int REQ_CD_CAMERA = 101;
	public final int REQ_CD_F = 102;
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	private FirebaseStorage _firebase_storage = FirebaseStorage.getInstance();
	
	private double intpos = 0;
	private boolean click = false;
	private HashMap<String, Object> map = new HashMap<>();
	private String photos = "";
	private String name = "";
	private String pic = "";
	private double photo = 0;
	private String email = "";
	private HashMap<String, Object> m = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	private ArrayList<Double> list = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> list1 = new ArrayList<>();
	private ArrayList<String> listz = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> map1 = new ArrayList<>();
	private ArrayList<String> liststring = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear11;
	private ListView listview1;
	private LinearLayout linear10;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear4;
	private CircleImageView circleimageview1;
	private LinearLayout linear5;
	private ImageView imageview2;
	private ImageView imageview1;
	private ImageView imageview7;
	private TextView textview1;
	private EditText edittext2;
	private ImageView imageview15;
	private ImageView imageview14;
	private TextView textview3;
	private TextView textview2;
	private ProgressBar progressbar1;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private ImageView imageview8;
	private ImageView imageview9;
	private ImageView imageview10;
	private ImageView imageview11;
	private ImageView imageview12;
	private ImageView imageview13;
	private ImageView imageview3;
	private LinearLayout linear12;
	private ImageView imageview4;
	private ImageView imageview5;
	private ImageView send;
	private EditText edittext1;
	
	private DatabaseReference alluser = _firebase.getReference("alluser");
	private ChildEventListener _alluser_child_listener;
	private StorageReference image = _firebase_storage.getReference("image");
	private OnCompleteListener<Uri> _image_upload_success_listener;
	private OnSuccessListener<FileDownloadTask.TaskSnapshot> _image_download_success_listener;
	private OnSuccessListener _image_delete_success_listener;
	private OnProgressListener _image_upload_progress_listener;
	private OnProgressListener _image_download_progress_listener;
	private OnFailureListener _image_failure_listener;
	private Calendar cal = Calendar.getInstance();
	private DatabaseReference Chat = _firebase.getReference("chat");
	private ChildEventListener _Chat_child_listener;
	private Intent camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
	private File _file_camera;
	private Intent f = new Intent(Intent.ACTION_GET_CONTENT);
	private FirebaseAuth auth;
	private OnCompleteListener<Void> auth_updateEmailListener;
	private OnCompleteListener<Void> auth_updatePasswordListener;
	private OnCompleteListener<Void> auth_emailVerificationSentListener;
	private OnCompleteListener<Void> auth_deleteUserListener;
	private OnCompleteListener<Void> auth_updateProfileListener;
	private OnCompleteListener<AuthResult> auth_phoneAuthListener;
	private OnCompleteListener<AuthResult> auth_googleSignInListener;
	private OnCompleteListener<AuthResult> _auth_create_user_listener;
	private OnCompleteListener<AuthResult> _auth_sign_in_listener;
	private OnCompleteListener<Void> _auth_reset_password_listener;
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.chat_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		com.google.firebase.FirebaseApp.initializeApp(getContext());
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		
		linear1 = (LinearLayout) _view.findViewById(R.id.linear1);
		linear2 = (LinearLayout) _view.findViewById(R.id.linear2);
		linear3 = (LinearLayout) _view.findViewById(R.id.linear3);
		linear11 = (LinearLayout) _view.findViewById(R.id.linear11);
		listview1 = (ListView) _view.findViewById(R.id.listview1);
		linear10 = (LinearLayout) _view.findViewById(R.id.linear10);
		linear6 = (LinearLayout) _view.findViewById(R.id.linear6);
		linear7 = (LinearLayout) _view.findViewById(R.id.linear7);
		linear4 = (LinearLayout) _view.findViewById(R.id.linear4);
		circleimageview1 = (CircleImageView) _view.findViewById(R.id.circleimageview1);
		linear5 = (LinearLayout) _view.findViewById(R.id.linear5);
		imageview2 = (ImageView) _view.findViewById(R.id.imageview2);
		imageview1 = (ImageView) _view.findViewById(R.id.imageview1);
		imageview7 = (ImageView) _view.findViewById(R.id.imageview7);
		textview1 = (TextView) _view.findViewById(R.id.textview1);
		edittext2 = (EditText) _view.findViewById(R.id.edittext2);
		imageview15 = (ImageView) _view.findViewById(R.id.imageview15);
		imageview14 = (ImageView) _view.findViewById(R.id.imageview14);
		textview3 = (TextView) _view.findViewById(R.id.textview3);
		textview2 = (TextView) _view.findViewById(R.id.textview2);
		progressbar1 = (ProgressBar) _view.findViewById(R.id.progressbar1);
		linear8 = (LinearLayout) _view.findViewById(R.id.linear8);
		linear9 = (LinearLayout) _view.findViewById(R.id.linear9);
		imageview8 = (ImageView) _view.findViewById(R.id.imageview8);
		imageview9 = (ImageView) _view.findViewById(R.id.imageview9);
		imageview10 = (ImageView) _view.findViewById(R.id.imageview10);
		imageview11 = (ImageView) _view.findViewById(R.id.imageview11);
		imageview12 = (ImageView) _view.findViewById(R.id.imageview12);
		imageview13 = (ImageView) _view.findViewById(R.id.imageview13);
		imageview3 = (ImageView) _view.findViewById(R.id.imageview3);
		linear12 = (LinearLayout) _view.findViewById(R.id.linear12);
		imageview4 = (ImageView) _view.findViewById(R.id.imageview4);
		imageview5 = (ImageView) _view.findViewById(R.id.imageview5);
		send = (ImageView) _view.findViewById(R.id.send);
		edittext1 = (EditText) _view.findViewById(R.id.edittext1);
		_file_camera = FileUtil.createNewPictureFile(getContext());
		Uri _uri_camera = null;
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
			_uri_camera= FileProvider.getUriForFile(getContext(), getContext().getPackageName() + ".provider", _file_camera);
		}
		else {
			_uri_camera = Uri.fromFile(_file_camera);
		}
		camera.putExtra(MediaStore.EXTRA_OUTPUT, _uri_camera);
		camera.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
		f.setType("image/*");
		f.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		auth = FirebaseAuth.getInstance();
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				_listviewSearch(listview1, "message", map1, map1, edittext2);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				startActivityForResult(f, REQ_CD_F);
			}
		});
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				startActivityForResult(f, REQ_CD_F);
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (click) {
					click = false;
					linear7.setVisibility(View.GONE);
				}
				else {
					click = true;
					linear7.setVisibility(View.VISIBLE);
				}
			}
		});
		
		send.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (photo == 0) {
					if (edittext1.getText().toString().length() > 0) {
						m = new HashMap<>();
						m.put("message", edittext1.getText().toString());
						m.put("email", FirebaseAuth.getInstance().getCurrentUser().getEmail());
						m.put("uid", FirebaseAuth.getInstance().getCurrentUser().getUid());
						m.put("name", name);
						m.put("pic", pic);
						cal = Calendar.getInstance();
						m.put("time", new SimpleDateFormat("HH:mm").format(cal.getTime()));
						Chat.push().updateChildren(m);
						edittext1.setText("");
					}
					else {
						SketchwareUtil.showMessage(getContext(), "message can not be empty");
					}
				}
				else {
					image.child(Uri.parse(photos).getLastPathSegment()).putFile(Uri.fromFile(new File(photos))).addOnFailureListener(_image_failure_listener).addOnProgressListener(_image_upload_progress_listener).continueWithTask(new Continuation<UploadTask.TaskSnapshot, Task<Uri>>() {
						@Override
						public Task<Uri> then(Task<UploadTask.TaskSnapshot> task) throws Exception {
							return image.child(Uri.parse(photos).getLastPathSegment()).getDownloadUrl();
						}}).addOnCompleteListener(_image_upload_success_listener);
					SketchwareUtil.showMessage(getContext(), "sending photo");
				}
			}
		});
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.trim().length() > 0) {
					imageview4.setVisibility(View.GONE);
					send.setImageResource(R.drawable.ic_send_black);
				}
				else {
					imageview4.setVisibility(View.VISIBLE);
					send.setImageResource(R.drawable.img_1);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		_alluser_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				if (_childValue.get("uid").toString().equals(FirebaseAuth.getInstance().getCurrentUser().getUid())) {
					name = _childValue.get("name").toString();
					email = _childValue.get("email").toString();
					textview1.setText(name);
				}
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		alluser.addChildEventListener(_alluser_child_listener);
		
		_image_upload_progress_listener = new OnProgressListener<UploadTask.TaskSnapshot>() {
			@Override
			public void onProgress(UploadTask.TaskSnapshot _param1) {
				double _progressValue = (100.0 * _param1.getBytesTransferred()) / _param1.getTotalByteCount();
				
			}
		};
		
		_image_download_progress_listener = new OnProgressListener<FileDownloadTask.TaskSnapshot>() {
			@Override
			public void onProgress(FileDownloadTask.TaskSnapshot _param1) {
				double _progressValue = (100.0 * _param1.getBytesTransferred()) / _param1.getTotalByteCount();
				textview2.setText(String.valueOf((long)(_progressValue)).concat("%"));
				progressbar1.setProgress((int)_progressValue);
			}
		};
		
		_image_upload_success_listener = new OnCompleteListener<Uri>() {
			@Override
			public void onComplete(Task<Uri> _param1) {
				final String _downloadUrl = _param1.getResult().toString();
				m = new HashMap<>();
				m.put("message", edittext1.getText().toString());
				m.put("email", FirebaseAuth.getInstance().getCurrentUser().getEmail());
				m.put("uid", FirebaseAuth.getInstance().getCurrentUser().getUid());
				m.put("name", name);
				m.put("pic", pic);
				m.put("photo", _downloadUrl);
				cal = Calendar.getInstance();
				m.put("time", new SimpleDateFormat("HH:mm").format(cal.getTime()));
				Chat.push().updateChildren(m);
				m.clear();
				edittext1.setText("");
				linear6.setVisibility(View.GONE);
				linear10.setVisibility(View.GONE);
				send.setImageResource(R.drawable.img_1);
				photo = 0;
				photos = "";
			}
		};
		
		_image_download_success_listener = new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
			@Override
			public void onSuccess(FileDownloadTask.TaskSnapshot _param1) {
				final long _totalByteCount = _param1.getTotalByteCount();
				
			}
		};
		
		_image_delete_success_listener = new OnSuccessListener() {
			@Override
			public void onSuccess(Object _param1) {
				
			}
		};
		
		_image_failure_listener = new OnFailureListener() {
			@Override
			public void onFailure(Exception _param1) {
				final String _message = _param1.getMessage();
				
			}
		};
		
		_Chat_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				Chat.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						map1 = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								map1.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						liststring.add(_childKey);
						listview1.setAdapter(new Listview1Adapter(map1));
						((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				Chat.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						map1 = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								map1.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						liststring.add(_childKey);
						listview1.setAdapter(new Listview1Adapter(map1));
						((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		Chat.addChildEventListener(_Chat_child_listener);
		
		auth_updateEmailListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_updatePasswordListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_emailVerificationSentListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_deleteUserListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_phoneAuthListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task){
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		auth_updateProfileListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_googleSignInListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task){
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_auth_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_auth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_auth_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	
	private void initializeLogic() {
		alluser.addChildEventListener(_alluser_child_listener);
		textview1.setText(FirebaseAuth.getInstance().getCurrentUser().getEmail());
		photo = 0;
		listview1.setTranscriptMode(ListView.TRANSCRIPT_MODE_NORMAL);
		listview1.setStackFromBottom(true);
		linear11.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)22, (int)1, 0xFF000000, 0xFFFFFFFF));
		linear7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)22, 0xFFFFFFFF));
		linear6.setVisibility(View.GONE);
		linear7.setVisibility(View.GONE);
		linear10.setVisibility(View.GONE);
		linear11.setVisibility(View.GONE);
	}
	
	@Override
	public void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			case REQ_CD_F:
			if (_resultCode == Activity.RESULT_OK) {
				ArrayList<String> _filePath = new ArrayList<>();
				if (_data != null) {
					if (_data.getClipData() != null) {
						for (int _index = 0; _index < _data.getClipData().getItemCount(); _index++) {
							ClipData.Item _item = _data.getClipData().getItemAt(_index);
							_filePath.add(FileUtil.convertUriToFilePath(getContext(), _item.getUri()));
						}
					}
					else {
						_filePath.add(FileUtil.convertUriToFilePath(getContext(), _data.getData()));
					}
				}
				photo = 1;
				photos = _filePath.get((int)(0));
				textview3.setText(Uri.parse(photos).getLastPathSegment());
				imageview14.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(_filePath.get((int)(0)), 1024, 1024));
				send.setImageResource(R.drawable.ic_send_black);
				linear6.setVisibility(View.VISIBLE);
				linear10.setVisibility(View.VISIBLE);
			}
			else {
				
			}
			break;
			
			case REQ_CD_CAMERA:
			if (_resultCode == Activity.RESULT_OK) {
				 String _filePath = _file_camera.getAbsolutePath();
				
				
			}
			else {
				
			}
			break;
			default:
			break;
		}
	}
	
	public void _listviewSearch (final ListView _listview, final String _kay, final ArrayList<HashMap<String, Object>> _listmap, final ArrayList<HashMap<String, Object>> _listSearch, final TextView _editText) {
		if (_editText.getText().toString().length() > 0) {
			intpos = _listmap.size() - 1;
			_listSearch.clear();
			for(int _repeat18 = 0; _repeat18 < (int)(_listmap.size()); _repeat18++) {
				if (_listmap.get((int)intpos).containsKey(_kay)) {
					if (_listmap.get((int)intpos).get(_kay).toString().toLowerCase().contains(_editText.getText().toString().toLowerCase())) {
						{
							HashMap<String, Object> _item = new HashMap<>();
							_item.put(_kay, _listmap.get((int)intpos).get(_kay).toString());
							_listSearch.add(_item);
						}
						
					}
				}
				intpos--;
			}
			listview1.setAdapter(new Listview1Adapter(_listSearch));
		}
		else {
			listview1.setAdapter(new Listview1Adapter(_listmap));
		}
	}
	
	
	public void _setcornerradius (final View _view, final double _radius, final double _shadow, final String _color) {
		android.graphics.drawable.GradientDrawable ab = new android.graphics.drawable.GradientDrawable();
		
		ab.setColor(Color.parseColor(_color));
		ab.setCornerRadius((float) _radius);
		_view.setElevation((float) _shadow);
		_view.setBackground(ab);
	}
	
	
	public class Listview1Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.messages, null);
			}
			
			final LinearLayout linear1 = (LinearLayout) _view.findViewById(R.id.linear1);
			final LinearLayout linear4 = (LinearLayout) _view.findViewById(R.id.linear4);
			final LinearLayout linear2 = (LinearLayout) _view.findViewById(R.id.linear2);
			final TextView username = (TextView) _view.findViewById(R.id.username);
			final LinearLayout linear3 = (LinearLayout) _view.findViewById(R.id.linear3);
			final ImageView photo = (ImageView) _view.findViewById(R.id.photo);
			final TextView message = (TextView) _view.findViewById(R.id.message);
			final TextView time = (TextView) _view.findViewById(R.id.time);
			final LinearLayout linear5 = (LinearLayout) _view.findViewById(R.id.linear5);
			final de.hdodenhof.circleimageview.CircleImageView profile2 = (de.hdodenhof.circleimageview.CircleImageView) _view.findViewById(R.id.profile2);
			final TextView username2 = (TextView) _view.findViewById(R.id.username2);
			final LinearLayout linear6 = (LinearLayout) _view.findViewById(R.id.linear6);
			final ImageView photo2 = (ImageView) _view.findViewById(R.id.photo2);
			final TextView time2 = (TextView) _view.findViewById(R.id.time2);
			final TextView message2 = (TextView) _view.findViewById(R.id.message2);
			
			if (_data.get((int)_position).get("uid").toString().equals(FirebaseAuth.getInstance().getCurrentUser().getUid())) {
				username2.setText(FirebaseAuth.getInstance().getCurrentUser().getEmail());
				message2.setText(_data.get((int)_position).get("message").toString());
				time2.setText(_data.get((int)_position).get("time").toString());
				if (_data.get((int)_position).containsKey("pic")) {
					profile2.setImageResource(R.drawable.img4_1);
				}
				if (_data.get((int)_position).containsKey("photo")) {
					photo2.setVisibility(View.VISIBLE);
					Glide.with(getContext()).load(Uri.parse(_data.get((int)_position).get("photo").toString())).into(photo2);
				}
				else {
					photo2.setVisibility(View.GONE);
				}
				linear1.setVisibility(View.GONE);
				linear4.setVisibility(View.VISIBLE);
				linear5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)22, 0xFFE1FFC7));
				photo.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFF5F5F5));
			}
			else {
				username.setText(FirebaseAuth.getInstance().getCurrentUser().getDisplayName());
				message.setText(_data.get((int)_position).get("message").toString());
				time.setText(_data.get((int)_position).get("time").toString());
				if (_data.get((int)_position).containsKey("photo")) {
					photo.setVisibility(View.VISIBLE);
					Glide.with(getContext()).load(Uri.parse(_data.get((int)_position).get("photo").toString())).into(photo);
				}
				else {
					photo.setVisibility(View.GONE);
				}
				linear1.setVisibility(View.VISIBLE);
				linear4.setVisibility(View.GONE);
				linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)22, 0xFFFFFFFF));
				photo2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFFF5F5F5));
			}
			
			return _view;
		}
	}
	
	
}