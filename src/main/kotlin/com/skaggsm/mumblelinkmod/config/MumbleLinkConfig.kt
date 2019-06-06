package com.skaggsm.mumblelinkmod.config

import com.skaggsm.mumblelinkmod.MumbleLink
import me.sargunvohra.mcmods.autoconfig1.ConfigData
import me.sargunvohra.mcmods.autoconfig1.annotation.Config

/**
 * Created by Mitchell Skaggs on 5/30/2019.
 */
@Config(name = MumbleLink.MODID)
class MumbleLinkConfig : ConfigData {
    var autoLaunchMumble: AutoLaunchOption = AutoLaunchOption.ACCEPT

    var defaultMumbleServer: String? = null

    enum class AutoLaunchOption {
        IGNORE,
        PROMPT,
        ACCEPT
    }
}
