using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Numerics;
using Xmu.Crms.Shared.Models;

namespace Xmu.Crms.Shared.Service
{
    /**
 * 定时器
 * 
 * @author qinlingyun liuaiqi
 * @version 2.00
 */
    public interface ITimerService
    {


        /**
		 * 讨论课结束后计算展示得分.
		 * <p>每天8点到21点 每四十分钟触发一次<br>
		 * <p>条件: 讨论课已结束<br>
		 * @author qinlingyun
		 */
        void CountPresentationGrade();

        /**
		 * 课前将固定小组复制一份作为讨论课小组名单.
		 * <p>每天7点到21点 每半小时触发一次<br>
		 * <p>条件: 讨论课上课前<br>
		 * @author qinlingyun
		 */
        void FixedGroupToSeminarGroup();



    }
}
