package com.srkr.myapplication

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.View

class CanvasActivity : AppCompatActivity() {
    private lateinit var surfaceView: SurfaceView
    private lateinit var surfaceHolder: SurfaceHolder
    private lateinit var paint: Paint
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_canvas)
        surfaceView = findViewById(R.id.surfaceView)
        surfaceHolder = surfaceView.holder
        paint = Paint()
        paint.color = Color.RED
        surfaceView.post {
            draw()
        }
    }
    private fun draw() {
        val canvas = surfaceHolder.lockCanvas()
        if (canvas != null) {
            val paint = Paint()
            //paint.color = resources.getColor(R.color.pink)
            paint.color = Color.YELLOW
            paint.style = Paint.Style.FILL
            canvas.drawRect(100f, 100f, 300f, 200f, paint)
        // Draw an oval
            val oval = RectF(400f, 100f, 600f, 200f)
            canvas.drawOval(oval, paint)

        // Draw a circle
            canvas.drawCircle(200f, 400f, 100f, paint)

        // Draw a line
            paint.color = Color.YELLOW
            //paint.color = resources.getColor(R.color.pink)
            paint.strokeWidth = 20f
            canvas.drawLine(400f, 400f, 600f, 600f, paint)
            surfaceHolder.unlockCanvasAndPost(canvas)
        }

        surfaceView.postDelayed({ draw()
        },1600)
    }

}