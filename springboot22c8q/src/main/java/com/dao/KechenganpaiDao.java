package com.dao;

import com.entity.KechenganpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechenganpaiVO;
import com.entity.view.KechenganpaiView;


/**
 * 课程安排
 * 
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
public interface KechenganpaiDao extends BaseMapper<KechenganpaiEntity> {
	
	List<KechenganpaiVO> selectListVO(@Param("ew") Wrapper<KechenganpaiEntity> wrapper);
	
	KechenganpaiVO selectVO(@Param("ew") Wrapper<KechenganpaiEntity> wrapper);
	
	List<KechenganpaiView> selectListView(@Param("ew") Wrapper<KechenganpaiEntity> wrapper);

	List<KechenganpaiView> selectListView(Pagination page,@Param("ew") Wrapper<KechenganpaiEntity> wrapper);
	
	KechenganpaiView selectView(@Param("ew") Wrapper<KechenganpaiEntity> wrapper);
	

}
