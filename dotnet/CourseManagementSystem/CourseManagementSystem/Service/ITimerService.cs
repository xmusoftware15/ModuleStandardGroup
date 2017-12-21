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
         * 此部分待根据数据库部分entity进行修改
         * 向Event表插入数据.
         * @author qinlingyun
         * @param time 事件的时间
         * @param beanName 方法名称
         * @param paramMap 方法参数
         */
        //void InsertEvent(Date time, Bean beanName, HashMap<Integer, String> paramMap);

        /**
         * 每十分钟检查一次Event实体的状况
         * @author qinlingyun
         */
        void Scheduled();





    }
}
