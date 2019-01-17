package self.he.mapper;

import self.he.pojo.Girl;

public interface GirlMapper {
   int insert(Girl girl);
   Girl queryById(Long id);
}
