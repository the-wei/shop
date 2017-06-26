package cn.cie.mapper;

import cn.cie.entity.Game;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GameMapper {

    int insert(Game record);

    Game selectById(Integer id);

    int selectNums();

    List<Game> selectByPage(@Param(value = "startPos") Integer startPos, @Param(value = "size") Integer size);

    List<Game> selectByIds(@Param(value = "ids") List<Integer> ids);

    List<Game> selectByIdsAndStat(@Param(value = "ids") List<Integer> ids, @Param(value = "stat") Byte stat);

    List<Game> selectByIdsAndStatAndPage(@Param(value = "ids") List<Integer> ids, @Param(value = "stat") Byte stat,
                                         @Param(value = "startPos") Integer startPos, @Param(value = "size") Integer size);

    List<Game> selectByStat(Byte stat);

    int update(Game record);

}