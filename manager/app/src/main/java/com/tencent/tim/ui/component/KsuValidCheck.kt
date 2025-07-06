package com.tencent.tim.ui.component
 
import androidx.compose.runtime.Composable
import com.tencent.tim.Natives
import com.tencent.tim.ksuApp
 
@Composable
fun KsuIsValid(
    content: @Composable () -> Unit
) {
    val isManager = Natives.becomeManager(ksuApp.packageName)
    val ksuVersion = if (isManager) Natives.version else null
     
    if (ksuVersion != null) {
        content()
    }
}