package 翻译;

import java.io.IOException;
import java.net.URLDecoder;

import casia.isiteam.ga.translate.common.engine.GoogleTranslate;
import casia.isiteam.ga.translate.common.engine.inter.TranslateEngine;
import net.sf.json.JSONObject;

public class Translate {
	/**
	 * 翻译缅甸文
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "当恒大陷入被动或者说失败边缘的时候，恒大队总会有人能够站出来拯救球队，这一次是巴西外援保利尼奥。12月13日下午，恒大队在2015年世俱杯首战之中遭遇了强敌墨西哥美洲队，这支堪称“美洲联队”的百年俱乐部同样希望能够战胜恒大对阵巴萨，对手也几乎看到了希望，可惜保利尼奥在关键时刻带领自己的队友毁灭了他们的梦想。先是利用反击撕破对手防线，策划了扳平的进球，接下来更是直接破门帮助恒大实现逆转，这就是保利尼奥，在这样一场关键的比赛之中证明了自己的价值。比赛结束之后，连墨西哥美洲队主教练安布里什都不得不承认：第一个失球是我们的防守负有责任，我们本来一直在重点防守保利尼奥，但还是出现了疏忽让他突破了我们的防守，最后打进了这个球，这个进球也成为转折点。赛后，保利尼奥也当之无愧地成为本场比赛最佳球员，谈及自己的表现与进球的感受，这位巴西后腰表示：我想说的是，今天的胜利来自我们团队正能量，正是这种力量让我们所有人都充满了非常积极的态度与进取心，所以这个胜利并不是属于我一个人的，而是属于所有人的胜利。当然，最有资格褒奖自己弟子的还是主教练斯科拉里，谈到保利尼奥对于球队的重要性，斯科拉里坦言：保利尼奥来到我们球队一个月之后就适应了这里的氛围，他成为今年到目前为止队中最重要的球员，他每天都是第一个到达训练场，最后一个离开，不管有没有伤病都坚持不懈训练，尤其是定位球的攻守两端都达到非常好的能力与作用。他在科林蒂安的时候就表现非常出色，在巴西国家队也有过进球，今年这半年我认为他已经达到了个人的最佳状态。谈到今天的绝杀，保利尼奥则表示：这样的进球真得太完美了，足球比赛不到最后一秒就不应该放弃，今天我们就证明了这一点。我在职业生涯中也有过类似的绝杀进球，其中就包括在巴西国家队的比赛，所以我一直要求自己的就是不到比赛结束就不要放弃任何努力。接下来恒大将面对世界超一流球队西班牙巴塞罗那，而保利尼奥在英超的时候曾经多次面对欧洲豪门，那么保利尼奥会有什么经验给队友借鉴呢？对此这位";
		String google_translate = google_translate(str);
		JSONObject fromObject = JSONObject.fromObject(google_translate);
		String text = fromObject.get("targetText").toString();
		System.out.println(text);
	}

	//谷歌翻译
	public static String google_translate(String para){
		String transResult = "";
	    try {
	    	String content =  URLDecoder.decode(para, "UTF-8");
	    	TranslateEngine translateEngine=new GoogleTranslate();
	    	transResult = translateEngine.translate("auto","en",content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	    return transResult;
	}
}
